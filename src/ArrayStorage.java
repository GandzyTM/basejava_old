import java.util.ArrayList;
import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int saveCount = 0;

    void clear() {

    }

    void save(Resume r) {
        saveCount++;
        storage[saveCount - 1] = r;
    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, saveCount);
//        return new Resume[0];
    }

    int size() {
        return 0;
    }
}
