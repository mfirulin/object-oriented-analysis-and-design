public enum Builder {
    FENDER,
    GIBSON,
    MARTIN,
    ANY;
    
    public String toString() {
        switch(this) {
            case FENDER:
                return "Fender";
            case GIBSON:
                return "Gibson";
            case MARTIN:
                return "Martin";
            case ANY:
                return "Any";
            default:
                return "<Unknown>";
        }
    }
}
