package steps

import cucumber.api.PendingException
import implementation.ActionsImpl


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~/^user clicks on register a new account$/) { ->
    ActionsImpl.getLoginActions().clickRegister()
}

And(~/^user enters "([^"]*)" as name$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

And(~/^user enters unique email$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^user enters "([^"]*)" as password/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^user enters "([^"]*)" as confirm password$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

And(~/^user clicks register a new account button$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Then(~/^new user account should be created$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}