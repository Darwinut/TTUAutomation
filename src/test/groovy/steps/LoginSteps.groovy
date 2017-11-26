package steps

import cucumber.api.PendingException
import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import implementation.ActionsImpl
import implementation.RocketTestException

/**
 * Created by FOB Solutions
 */

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Then(~/^login view should be visible$/) { ->
    if (!ActionsImpl.getLoginActions().isLoginPageVisible()) {
        throw new RocketTestException("Login page should be visible")
    }
}
And(~/^user enters "([^"]*)" into username field$/) { String username  ->
    ActionsImpl.getLoginActions().enterUsername(username)
}
When(~/^user enters "([^"]*)" into Password field$/) { String password ->
    ActionsImpl.getLoginActions().enterPassword(password)
}
Then(~/^user clicks Login button$/) { ->
    ActionsImpl.getLoginActions().clickLogin()
}
And(~/^login landing page should be visible$/) { ->
    if (!ActionsImpl.getAccountlandingActions().isAccountlandingPageVisible()) {
        throw new RocketTestException("Account landing page should be visible")
    }
}