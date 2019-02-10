import java.util.Objects;

public class Bark {
   private String sound;

   public Bark(String sound) {
       this.sound = sound;
   }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (getClass() != other.getClass()) return false;

        Bark otherBark = (Bark) other;
        return Objects.equals(sound, otherBark.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sound);
    }
}
