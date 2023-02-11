import java.security.InvalidKeyException;

public class Helper {

    private String _theKey;

    public Helper(String keyName) throws InvalidKeyException {
        if (keyName == null || keyName.isEmpty()) {
            throw new InvalidKeyException();
        }

        this._theKey = keyName;
    }
}
