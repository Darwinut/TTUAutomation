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
And(~/^user enters unique emailID as email$/) { ->
    Date date = new Date()
    long uus = date.getTime()
    String email = "rocket"+uus+"@gmail.com"
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
And(~/^use the suggesting username$/) { ->
    ActionsImpl.getRegistrationActions().clickUseThisUsername()
}
And(~/^user enters "([^"]*)" username as name$/) {  String UniqueUsername ->
    ActionsImpl.getRegistrationActions().enterUniqueUsername(UniqueUsername)
}