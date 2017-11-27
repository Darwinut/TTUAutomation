package steps

import cucumber.api.PendingException
import implementation.ActionsImpl


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~/^user clicks on register a new account$/) { ->
    ActionsImpl.getLoginActions().clickRegister()
}

And(~/^user enters "([^"]*)" as name$/) {  String name ->
    ActionsImpl.getRegistrationActions().enterName(name)
}

And(~/^user enters "([^"]*)" as email$/) {String email ->
    ActionsImpl.getRegistrationActions().enterEmail(email)
}
And(~/^user enters "([^"]*)" as password/) { String password ->
    ActionsImpl.getRegistrationActions().enterPassword(password)
}
And(~/^user enters "([^"]*)" as confirm password$/) { String confirmpassword ->
    ActionsImpl.getRegistrationActions().enterConfirmPassword(confirmpassword)
}

And(~/^user clicks register a new account button$/) { ->
    ActionsImpl.getRegistrationActions().clickRegister()
}

Then(~/^new user account should be created$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}