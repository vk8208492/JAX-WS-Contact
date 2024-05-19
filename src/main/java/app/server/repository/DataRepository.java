package app.server.repository;

import app.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", "555 555"));
        list.add(new Contact(2, "Alice", "666 666"));
        list.add(new Contact(3, "Bob", "777 777"));
        return list;
    }
}
