
package fr.techlab.businessv2services.ws.savetask;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5.redhat-630310
 * 2018-05-02T23:30:14.079+02:00
 * Generated source version: 3.1.5.redhat-630310
 */

@WebFault(name = "technicalException", targetNamespace = "http://www.techlab.fr/SGOV2/Schemas/TechnicalException")
public class TechnicalException extends Exception {
    
    private fr.techlab.sgov2.schemas.technicalexception.TechnicalException technicalException;

    public TechnicalException() {
        super();
    }
    
    public TechnicalException(String message) {
        super(message);
    }
    
    public TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalException(String message, fr.techlab.sgov2.schemas.technicalexception.TechnicalException technicalException) {
        super(message);
        this.technicalException = technicalException;
    }

    public TechnicalException(String message, fr.techlab.sgov2.schemas.technicalexception.TechnicalException technicalException, Throwable cause) {
        super(message, cause);
        this.technicalException = technicalException;
    }

    public fr.techlab.sgov2.schemas.technicalexception.TechnicalException getFaultInfo() {
        return this.technicalException;
    }
}
