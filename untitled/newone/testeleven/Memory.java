package testeleven;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, null,
                "object32", null, "object4"};

        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int index = 0; // Pointer to place non-null elements

        // Move non-null elements to the front
        for (String element : array) {
            if (element != null) {
                array[index++] = element;
            }
        }

        // Fill the rest of the array with null values
        while (index < array.length) {
            array[index++] = null;
        }
    }
}
