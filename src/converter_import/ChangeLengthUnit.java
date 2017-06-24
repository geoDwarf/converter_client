
package converter_import;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LengthValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromLengthUnit" type="{http://www.webserviceX.NET/}Lengths"/>
 *         &lt;element name="toLengthUnit" type="{http://www.webserviceX.NET/}Lengths"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lengthValue",
    "fromLengthUnit",
    "toLengthUnit"
})
@XmlRootElement(name = "ChangeLengthUnit")
public class ChangeLengthUnit {

    @XmlElement(name = "LengthValue")
    protected double lengthValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Lengths fromLengthUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Lengths toLengthUnit;

    /**
     * Recupera il valore della proprietà lengthValue.
     * 
     */
    public double getLengthValue() {
        return lengthValue;
    }

    /**
     * Imposta il valore della proprietà lengthValue.
     * 
     */
    public void setLengthValue(double value) {
        this.lengthValue = value;
    }

    /**
     * Recupera il valore della proprietà fromLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Lengths }
     *     
     */
    public Lengths getFromLengthUnit() {
        return fromLengthUnit;
    }

    /**
     * Imposta il valore della proprietà fromLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengths }
     *     
     */
    public void setFromLengthUnit(Lengths value) {
        this.fromLengthUnit = value;
    }

    /**
     * Recupera il valore della proprietà toLengthUnit.
     * 
     * @return
     *     possible object is
     *     {@link Lengths }
     *     
     */
    public Lengths getToLengthUnit() {
        return toLengthUnit;
    }

    /**
     * Imposta il valore della proprietà toLengthUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Lengths }
     *     
     */
    public void setToLengthUnit(Lengths value) {
        this.toLengthUnit = value;
    }

}
