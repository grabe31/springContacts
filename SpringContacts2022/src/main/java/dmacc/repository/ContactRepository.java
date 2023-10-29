package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Contact;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 21, 2023
 */

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
