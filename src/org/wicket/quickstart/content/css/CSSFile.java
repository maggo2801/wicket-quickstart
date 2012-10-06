package org.wicket.quickstart.content.css;

import org.apache.wicket.request.resource.CssResourceReference;

public interface CSSFile {

  public static final CssResourceReference LAYOUT = new CssResourceReference(CSSFile.class, "layout.css");
}
