package cascading.legstar.cobolcopybook.beans.bean9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp05V10Profile2Nd7Dgts complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp05V10Profile2Nd7Dgts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp05V10Prof5099" maxOccurs="50" minOccurs="50">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp05V10Profile2Nd7Dgts", propOrder = {"kcp05V10Prof5099"})
public class Kcp05V10Profile2Nd7Dgts implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(type = Integer.class)
  @CobolElement(cobolName = "KCP05V10-PROF-50-99", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 7, minOccurs = 50, maxOccurs = 50, picture = "S9(7)", usage = "PACKED-DECIMAL", srceLine = 36)
  protected List<Integer> kcp05V10Prof5099;

  /**
   * Gets the value of the kcp05V10Prof5099 property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp05V10Prof5099 property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp05V10Prof5099().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Integer }
   */
  public List<Integer> getKcp05V10Prof5099()
    {
    if( kcp05V10Prof5099 == null )
      {
      kcp05V10Prof5099 = new ArrayList<Integer>();
      }
    return this.kcp05V10Prof5099;
    }

  }
