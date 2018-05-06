package Netspan.API.Lte.IRetunTypes;

/**
 * Created by owiesel on 10-Jul-16.
 */
public interface ILteEndDetails {
    /**
     * Gets the value of the sonProfile property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSonProfile();

    /**
     * Sets the value of the sonProfile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSonProfile(String value);

    public String getNetworkProfile();


    public void setNetworkProfile(String value);
}