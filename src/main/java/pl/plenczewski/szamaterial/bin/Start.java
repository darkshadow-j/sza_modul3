package pl.plenczewski.szamaterial.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.plenczewski.szamaterial.model.AppUser;
import pl.plenczewski.szamaterial.repository.AppUserRepo;
import sun.security.util.Password;

@Component
public class Start {

    private PasswordEncoder passwordEncoder;
    private AppUserRepo appUserRepo;

    @Autowired
    public Start(PasswordEncoder passwordEncoder, AppUserRepo appUserRepo) {
        this.passwordEncoder = passwordEncoder;
        this.appUserRepo = appUserRepo;

        AppUser appUser = new AppUser();
        appUser.setUsername("user");
        appUser.setPassword(passwordEncoder.encode("user123"));
        appUserRepo.save(appUser);
    }
}
