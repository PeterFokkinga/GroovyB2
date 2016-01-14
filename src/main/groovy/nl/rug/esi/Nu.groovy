package nl.rug.esi

import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method

/**
 * @author <a href="p.r.fokkinga [at] rug.nl">Peter Fokkinga</a>
 */
class Nu {
  List<String> titles

  Nu() {
    def nu = new HTTPBuilder("http://nu.nl/rss")
    def rss = nu.request(Method.GET, ContentType.XML) {}
    titles = rss.channel.item.title.collect { it.text() }
  }
}
