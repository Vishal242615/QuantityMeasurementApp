public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {

        // private final → ensures immutability
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Getter (optional, but good practice)
        public double getValue() {
            return value;
        }

        // Override equals() method
        @Override
        public boolean equals(Object obj) {

            // Step 1: Same reference check
            if (this == obj) {
                return true;
            }

            // Step 2: Null or different class check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            // Step 3: Type casting
            Feet other = (Feet) obj;

            // Step 4: Compare using Double.compare()
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method to test manually
    public static void main(String[] args) {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Are values equal? " + result);
    }
}