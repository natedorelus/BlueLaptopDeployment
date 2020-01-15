/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopdeployment;

import java.util.ArrayList;
import com.google.gson.*;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/**
 *
 * @author ndorelus
 */
public class Toolkit {
    
    private static ArrayList<User> users = new ArrayList();
    private static int currentUserIndex;
    
    public static User getUser(int place) {
        return users.get(place);
    }
    
    public static void addUser(User a) {
        users.add(a);
    }
    
    public static void addUser(int place, User a) {
        users.add(place, a);
    }
    
    public static void remove(int place) {
        users.remove(place);
    }
    
    public static int getSize() {
        return users.size();
    }
    
    public static void setCurrentIndex(int place) {
        currentUserIndex = place;
    }
    
    public static int getCurrentIndex() {
        return currentUserIndex;
    }
    
    public static User getCurrentUser() {
        return users.get(currentUserIndex);
    }
    
    public static boolean isEmpty() {
        return users.isEmpty();
    }
    
    public static void updateUser(int place, User a) {
        users.remove(place);
        users.add(place, a);
    }
    
    public static String checkAssetTag(String asset) {
        for (User a: users) {
            if (!a.missingComputer() && users.indexOf(a)!= currentUserIndex) {
                if (a.getCurrentComputer().getAssetTag().equals(asset)) return a.getFull();
            }
        }
        return "";
    }
    
    public static boolean checkCurrentAsset(String asset) {
        return !users.get(currentUserIndex).missingComputer() && users.get(currentUserIndex).getCurrentComputer().getAssetTag().equals(asset);
    }
    
    public static String checkSerialNumber(String ser) {
        for (User a: users) {
            if (!a.missingComputer() && users.indexOf(a)!= currentUserIndex) {
                if (a.getCurrentComputer().getSerial().equals(ser)) return a.getFull();
            }
        }
        return "";
    }
    
    public static boolean checkCurrentSerial(String ser) {
        return !users.get(currentUserIndex).missingComputer() && users.get(currentUserIndex).getCurrentComputer().getSerial().equals(ser);
    }
    
    public static String[] getUserNames() {
        String[] names = new String[users.size()];
        for (User a: users) {
            names[users.indexOf(a)] = a.getFull();
        }
        return names;
    }
    
    public static String exportDatabasetoJSON() {
        Gson gson = new Gson();
        String json = gson.toJson(users);
        return json;
    }
    
    public static void importDatabasefromJSON(String json) {
        Gson gson = new Gson();
        System.out.println(json);
        Type collectionType = new TypeToken<ArrayList<User>>(){}.getType();
        users = gson.fromJson(json, collectionType);
    }
}
