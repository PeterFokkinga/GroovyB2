import blackboard.platform.context.ContextManagerFactory
import groovy.xml.MarkupBuilder


def ctx = ContextManagerFactory.instance.context

new MarkupBuilder().html {
  head {
    title { "groovy demo" }
  }
  body {
    h1 {
      "Hello ${ctx.user.userName}"
    }
  }
}


