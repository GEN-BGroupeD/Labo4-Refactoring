
package ch.heigvd.gen2020;

public enum Color {
    RED,
    BLUE,
    YELLOW,
    NO_COLOR {
        @Override
        public String toString() {
            return "no color";
        }
    };

    public String toString() {
        return super.name().toLowerCase();
    }
}