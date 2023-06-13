package OOP.second;

abstract class animal {

        private String name;

        public animal(String name) {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void jump(){
            System.out.println("Jump");
        }
        public void voice (){
            System.out.println("Voice");
        }
    }
