package Action;

import Person.Person;

public interface Action<T> {
    void add(T element);
    void delete(int id);
    boolean show(int id);
    void showAll();
    T get(int id);
    Person searchByName(String name);
}
