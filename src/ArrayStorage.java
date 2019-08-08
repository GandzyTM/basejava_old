import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int saveCount = 0;

    void clear() {
        Arrays.fill(storage, 0, saveCount, null);
        saveCount = 0;
    }

    void save(Resume r) {
        saveCount++;
        storage[saveCount - 1] = r;
    }

    Resume get(String uuid) {
        return storage[findElement(uuid)];
    }

    void delete(String uuid) {

    }

    private int findElement(String uuid) {
        for (int i = 0; i < saveCount; i++) {
            if (storage[i].equals(uuid)) {
                return i;
            }
        }
        return 0;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, saveCount);
//        return new Resume[0];
    }

    int size() {
        return saveCount;
    }
}
