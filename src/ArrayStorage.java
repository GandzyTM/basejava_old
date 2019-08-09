import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int saveCount = 0;

    void save(Resume r) {
        saveCount++;
        storage[saveCount - 1] = r;
    }

    Resume get(String uuid) {
        return storage[findElement(uuid)];
    }

    int size() {
        return saveCount;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, saveCount);
//        return new Resume[0];
    }

    void delete(String uuid) {
        Arrays.fill(storage, findElement(uuid), findElement(uuid) + 1, null);
    }

    void clear() {
        Arrays.fill(storage, 0, saveCount, null);
        saveCount = 0;
    }

    private int findElement(String uuid) {
        for (int i = 0; i < saveCount; i++) {
//            System.out.println(Arrays.toString(Arrays.copyOf(storage, saveCount)).contains(uuid));
            if (Arrays.toString(Arrays.copyOf(storage, saveCount)).contains(uuid)) {
                if (String.valueOf(storage[i]).equals(uuid)) {
                    return i;
                }
            } else if (!Arrays.toString(Arrays.copyOf(storage, saveCount)).contains(uuid)){
                System.out.println("Didn't find");
            }
        }
        return -1;
    }
}
