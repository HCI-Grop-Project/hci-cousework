package org.ravindupriyankara;

import javax.swing.*;
import java.awt.*;

public class dashboardCard extends JPanel {
    public Card welcomeCard, items, accesories, cost;
    public MediumCards itemsList, serviceList;
    public dashboardCard() {

        welcomeCard = new Card(null, "Welcome !!", Color.WHITE, "", 20, 300, 150,
                90, 100, new Color(255, 0, 255), new Color(255, 255, 102), "Welcome to Senura Fernitures", Color.BLACK,
                16, "bagets", "/welcome.png");

        items = new Card(null, "Items !!", Color.WHITE, "", 20, 300, 150,
                430, 100, new Color(255, 0, 255), new Color(255, 255, 102), "Stylish and comfortable items.", Color.BLACK,
                14, "bagets", "/items.png");

        accesories = new Card(null, "Accessories !!", Color.WHITE, "", 20, 300, 150,
                770, 100, new Color(255, 0, 255), new Color(255, 255, 102), "Update your space with us", Color.BLACK,
                14, "bagets", "/house.png");

        cost = new Card(null, "Budget !!", Color.WHITE, "", 20, 300, 150,
                1110, 100, new Color(255, 0, 255), new Color(255, 255, 102), "Best Budget Items for you", Color.BLACK,
                14, "bagets", "/money.png");

        itemsList = new MediumCards(null, 350, 500, 90, 300, "Items We Have!", 20, "", Color.WHITE, "/chair.png",
                new Color(255, 0, 255), new Color(255, 255, 102), "Chair", "bageta", 16, Color.BLACK, "1000 $", Color.YELLOW, "/desk.png", "Desk", "1500 $",
                "/sofa.png", "Sofa Sets", "2500 $", "/cupboard.png", "Cupboards ", "3000 $", "/bed.png", "Bed", "3500 $");

        serviceList = new MediumCards(null, 350, 500, 1060, 300, "Our Services !", 20, "", Color.WHITE, "/delivery.png",
                new Color(255, 0, 255), new Color(255, 255, 102), "Fast Delivary", "bageta", 16, Color.BLACK, "0 $", Color.YELLOW, "/desk.png", "Desk", "1500 $",
                "/sofa.png", "Sofa Sets", "2500 $", "/cupboard.png", "Cupboards ", "3000 $", "/bed.png", "Bed", "3500 $");



        //disable cards
        welcomeCard.setVisible(false);
        items.setVisible(false);
        accesories.setVisible(false);
        cost.setVisible(false);
        itemsList.setVisible(false);
        serviceList.setVisible(false);
    }
}