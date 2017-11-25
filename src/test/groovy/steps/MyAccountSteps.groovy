package steps

import cucumber.api.PendingException
import implementation.ActionsImpl

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Then(~/^user clicks on enable desktop notification button$/) { ->

    ActionsImpl.getAccountActions().enableDesktopNotifications()

}