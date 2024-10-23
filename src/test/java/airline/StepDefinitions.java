package airline;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions.*;
import io.cucumber.datatable.DataTable;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();
    public Boolean minorsIncluded = false;

    @Given("User navigates to the ticket reservation application")
    public void user_navigates_to_the_ticket_reservation_application() {
        if (true) 
            return; // avoid the exception
        else
            throw new io.cucumber.java.PendingException();
    }

    @When("User books a flight from {string} to {string}")
    public void userBooksAFlightFromFlyingFromToFlyingTo(String flyingFrom, String flyingTo) {
        actionwords.userBooksAFlightFromFlyingFromToFlyingTo(flyingFrom, flyingTo);
        if (true) 
            return; // avoid the exception
        else
            throw new io.cucumber.java.PendingException();
    }

    @When("Selects {string} class with {string} baggage")
    public void selectsClassClassWithBaggageBaggage(String flyClass, String baggage) {
        actionwords.selectsClassClassWithBaggageBaggage(flyClass, baggage);
        return;
    }

    @When("Provides the details for {string} adult\\(s\\) with {string} minor\\(s\\)")
    public void providesTheDetailsForAdultsAdultsWithChildrenMinors(String adults, String children) {
        actionwords.providesTheDetailsForAdultsAdultsWithChildrenMinors(adults, children);
        if (children.equals("0"))
            minorsIncluded = false;
        else
            minorsIncluded = true;
        return;
    }

    @When("Chooses to pay with {string} and clicks Buy")
    public void choosesToPayWithPaymentMethodAndClicksBuy(String paymentMethod) throws Exception {
        actionwords.choosesToPayWithPaymentMethodAndClicksBuy(paymentMethod);
        assert !(paymentMethod.equals("Crypto") && minorsIncluded) : "When travelling with children, custormer will not be able to pay with crypto";
        return;
    }

    @Then("Ticket reservation with the appropriate details appears in the reservation database")
    public void ticket_reservation_with_the_appropriate_details_appears_in_the_reservation_database() {
     }

}
