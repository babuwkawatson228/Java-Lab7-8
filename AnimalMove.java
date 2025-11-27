public interface  AnimalMove {
    default void move(Object obj) {
        System.out.println(obj.getClass().getSimpleName() + " is moving");
    };
}
