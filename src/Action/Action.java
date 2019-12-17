package Action;

import Person.Person;

public interface Action<T> {
    void add(T element);
    void delete(int id);
    void show(int id);
    void showAll();
    T get(int id);
    Person searchByName(String name);
}
