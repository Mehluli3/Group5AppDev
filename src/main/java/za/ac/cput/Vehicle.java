package za.ac.cput;


    /**
     * @author Chadleigh Dunbar - 218065256
     *
     * This is a simple Vehicle application.
     */
    public class Vehicle {

        private String Model, Name;

        public String getModel(){

            return Model;
        }

        public void setModel(String model) {

            this.Model = model;
        }

        public String getName() {

            return Name;
        }

        public void setName(String name) {

            Name = name;
        }

        @Override
        public String toString(){
            return "Vehicle{" +
                    "Model='" + Model + '\'' +
                    " Name='" + Name + '\'' +
                    '}';
        }
    }


