package org.wicket.quickstart.content.js;

import org.apache.wicket.request.resource.JavaScriptResourceReference;

public interface JSFile {

  public static final JavaScriptResourceReference GENERAL = new JavaScriptResourceReference(JSFile.class, "general.js");

}
