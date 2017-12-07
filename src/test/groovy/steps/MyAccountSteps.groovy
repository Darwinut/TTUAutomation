package steps

import cucumber.api.PendingException
import implementation.ActionsImpl

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Then(~/^user clicks on enable desktop notification button$/) { ->
    ActionsImpl.getAccountActions().enableDesktopNotifications()
}
When(~/^user clicks on sidebar header$/) { ->
    ActionsImpl.getHomeActions().clickSidebarHeader()
}

Then(~/^user clicks on Logout button$/) { ->
    ActionsImpl.getHomeActions().clickLogout()
}
And(~/^user clicks on My Account button$/) { ->
    ActionsImpl.getHomeActions().clickMyAccount()
}
When(~/^user clicks on general channel$/) { ->
    ActionsImpl.getHomeActions().clickGeneralChannel()
}
And(~/^user enters welcome message "([^"]*)" in message box$/) { String message ->
    ActionsImpl.getHomeActions().enterMessage(message)
}
Then(~/^user hits enter$/) { ->
    ActionsImpl.getHomeActions().clickSend()
}