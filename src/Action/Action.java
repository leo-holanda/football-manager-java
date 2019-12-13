package Action;

import Player.*;
import Staff.*;

public interface Action<T> {
    void add(T element);
    void delete(int id);
    void show(int id);
    void showAll();
}
