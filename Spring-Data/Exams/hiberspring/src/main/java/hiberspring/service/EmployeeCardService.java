package hiberspring.service;



import hiberspring.domain.entities.EmployeeCard;

import java.io.IOException;

public interface EmployeeCardService {

    Boolean employeeCardsAreImported();

    String readEmployeeCardsJsonFile() throws IOException;

    String importEmployeeCards(String employeeCardsFileContent) throws IOException;


    boolean isCardExist(String number);

    EmployeeCard findCardByNumber(String number);
}
