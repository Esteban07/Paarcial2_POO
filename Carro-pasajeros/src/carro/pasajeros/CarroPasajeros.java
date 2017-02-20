package carro.pasajeros;

public class CarroPasajeros {
    
    public class person{
        
        private String nombre;
        private String apellido;

        public person(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }
    }
    
    public class carro{
        private person persona;
        private person conductor;
        private person otra_persona;

        
        public void setPersona(person persona) {
            this.persona = persona;
        }

        public person getConductor() {
            return conductor;
        }

        public void setConductor(person conductor) {
            this.conductor = conductor;
        }

        public person getOtra_persona() {
            return otra_persona;
        }

        public void setOtra_persona(person otra_persona) {
            this.otra_persona = otra_persona;
        }
        String[] getPasajeros(){
            String[]names = new String[2];
            name[0]=this.persona getName();
            name[1]=this.otra_persona getName();
            return names;
        }
        
}
        public person getPersona() {
            return persona;
        }
  
        
  
}
