package com.ojun.ojun;

import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{
            {"Driver","Ahmad Subarjo","https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Udin Mahma", "https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Donan Malaka","https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Palaka Kalam","https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Manda Ala","https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Donan Ahmad","https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Paleka Maman","https://storage.googleapis.com/coba-ojun/profil.png"},
            {"Driver","Bambang Nigra","https://storage.googleapis.com/coba-ojun/profil.png"},
    };

    public static ArrayList<Contact> getListData(){
        Contact contact = null;
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
            contact = new Contact();
            contact.setJudul(data[i][0]);
            contact.setName(data[i][1]);
            contact.setPhoto(data[i][2]);
            list.add(contact);
        }
        return list;
    }
}

