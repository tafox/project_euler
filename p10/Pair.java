public class Pair { 
        int value;
        Problem10.Type type;

        public Pair(int in, Problem10.Type in2) {
            value = in;
            type = in2;
        }
        
        public void setType(Problem10.Type in) {
            type = in;
            
        }

        public Problem10.Type getType() {
            return type;
        }

        public void setValue(int in) {
            value = in;
        }

        public int getValue() {
            return value;
        }
}

