package Models;

import com.google.gson.annotations.SerializedName;

public class Ser {

    @SerializedName("si")
    private String serviceIdentifier;
    public String getServiceIdentifier() {
		return serviceIdentifier;
	}
	public String getKey() {
		return key;
	}
	@SerializedName("key")
    private String key;


}
