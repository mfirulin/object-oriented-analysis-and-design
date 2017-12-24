public enum Wood {
    ALDER,
    MAPLE,
    MAHOGANY,
    ROSEWOOD,
    ANY;
    
    public String toString() {
        switch(this) {
            case ALDER:
                return "Alder";
            case MAPLE:
                return "Maple";
            case MAHOGANY:
                return "Mahogany";
            case ROSEWOOD:
                return "Rosewood";
            case ANY:
                return "Any";
            default:
                return "<Unknown>";
        }
    }
}
