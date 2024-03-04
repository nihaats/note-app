package com.noteapp.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import util.GeneralUtils;

import java.util.Collection;
import java.util.Map;

public class LocalUser extends User implements OAuth2User, OidcUser {

    //serialVersionUID sınıfın serileştirilmiş bir versiyonunu tanımlamak için kullanılmıştır.
    // Bu sayede, sınıf yapısında değişiklik yapıldığında uyumsuzlukları tespit etmek için kullanılır.
    private static final long serialVersionUID = -2845160792248762779L;
    private final OidcIdToken oidcIdToken;
    private final OidcUserInfo oidcUserInfo;
    private final com.noteapp.model.User userModel;
    private Map<String, Object> attributes;

    public LocalUser(final String userID, final String password, final boolean enabled,
                    final boolean accountNonExpired, final boolean credentialsNonExpired,
                    final boolean accountNonLocked, final Collection<? extends GrantedAuthority> authorities,
            final com.noteapp.model.User user) {
        this(userID, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities,
                user,null, null);
    }

    public LocalUser(final String userID, final String password, final boolean enabled,
                     final boolean accountNonExpired, final boolean credentialsNonExpired,
                     final boolean accountNonLocked, final Collection<? extends GrantedAuthority> authorities,
                     final com.noteapp.model.User user,
            OidcIdToken oidcIdToken, OidcUserInfo oidcUserInfo) {
        super(userID, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.oidcIdToken = oidcIdToken;
        this.oidcUserInfo = oidcUserInfo;
        this.userModel = user;
    }

    public static LocalUser create(com.noteapp.model.User user, Map<String, Object> attributes,
                                   OidcIdToken idToken, OidcUserInfo userInfo) {

        LocalUser localUser = new LocalUser(user.getUsername(), user.getPassword(), true, true, true, true,
                GeneralUtils.buildSimpleGrantedAuthorities(user.getRole()),
                user, idToken, userInfo);
        localUser.setAttributes(attributes);
        return localUser;
    }

    @Override
    public Map<String, Object> getClaims() {
        return null;
    }

    @Override
    public OidcUserInfo getUserInfo() {
        return null;
    }

    @Override
    public OidcIdToken getIdToken() {
        return null;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return null;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
