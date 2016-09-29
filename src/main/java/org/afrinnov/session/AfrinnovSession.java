package org.afrinnov.session;

import java.time.ZonedDateTime;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Getter;

/**
 * 
 * @author simon.pascal.ngos
 *
 */
@Component
@SessionScope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class AfrinnovSession {
 
	
	@Getter
  private final String date;

  public AfrinnovSession() {
	  date=ZonedDateTime.now().toString();
   }
  
  
}
