package steps

import cucumber.api.PendingException
import implementation.ActionsImpl

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Then(~/^user clicks on enable desktop notification button$/) { ->
    ActionsImpl.getAccountActions().enableDesktopNotifications()
}
When(~/^user clicks on sidebar header$/) { ->
    ActionsImpl.getAccountlandingActions().clickSidebarHeader()
}

Then(~/^user clicks on Logout button$/) { ->
    ActionsImpl.getAccountlandingActions().clickLogout()
}
And(~/^user clicks on My Account button$/) { ->
    ActionsImpl.getAccountlandingActions().clickMyAccount()
}