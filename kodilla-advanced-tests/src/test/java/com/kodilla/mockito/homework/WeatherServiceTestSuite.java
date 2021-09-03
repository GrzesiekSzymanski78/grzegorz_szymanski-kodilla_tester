package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Set<Location> locations = new HashSet<>();
    Set<Client> clients = new HashSet<>();

    @BeforeEach
    public void prepareData() {
        clients.add(client);
        clients.add(client1);
        clients.add(client2);
        locations.add(location);
        locations.add(location1);
        locations.add(location2);
        for (Location location : locations) {
            weatherService.addSubscriber(client, location);
            weatherService.addSubscriber(client1, location);
        }
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientToLocationShouldReceiveNotification() {
        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationsShouldBeSendToAllSubscribers() {

        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(0)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToOneLocationToMultiTimeSubscriber() {

        weatherService.sendNotificationToLocation(notification, location);
        weatherService.sendNotificationToLocation(notification, location1);
        weatherService.sendNotificationToLocation(notification, location2);
        Mockito.verify(client, Mockito.times(3)).receive(notification);
    }

    @Test
    public void clientShouldNotReceiveNotificationToUnsubscribedLocation() {

        weatherService.removeSubscriptionFromLocation(client, location);
        weatherService.sendNotificationToLocation(notification, location);
        weatherService.sendNotificationToLocation(notification, location1);
        weatherService.sendNotificationToLocation(notification, location2);

        Mockito.verify(client, Mockito.times(2)).receive(notification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        for (Location location : locations) {
            weatherService.removeAllSubscriptions(client);
        }
        Mockito.verify(client,Mockito.never()).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        weatherService.removeLocation(location);
        weatherService.sendNotificationToLocation(notification,location);
        weatherService.sendNotificationToLocation(notification,location1);
        weatherService.sendNotificationToLocation(notification,location2);

        Mockito.verify(client,Mockito.times(2)).receive(notification);
    }
}