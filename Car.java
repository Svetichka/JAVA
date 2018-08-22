
    class Car {

        private String name;

        private String year;

        private String color;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = "Honda";
        }


        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = "2015";
        }

        public String getColor() {
            return name;
        }

        public void setColor(String color) {
            this.color = "blue";
        }



        @Override
        public String toString() {
            return "Car" +
                    "name=" + name  +
                    " year=" + year +
                    " color=" + color;

        }

    }



    class CarDemo {
        public static void main(String[] args) {


            Car car = new Car();

            car.setName("BMB");

            car.setYear("2018");

            car.setColor("Red");


            String CarString = "Car.toString()";
            System.out.println(car);


        }
    }


