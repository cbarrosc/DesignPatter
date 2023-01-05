package creational.singleton.innetstatic;

public class InnerStaticSingleton {

        private InnerStaticSingleton() {
        }

        //only one instance of this class is created cause is static
        private static class Impl {
            private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
        }

        public static InnerStaticSingleton getInstance() {
            return Impl.INSTANCE;
        }
}
