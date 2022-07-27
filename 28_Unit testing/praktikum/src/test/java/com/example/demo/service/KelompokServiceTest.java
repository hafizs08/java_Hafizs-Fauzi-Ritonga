package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Entity;

import com.example.demo.entity.Kelompok;
import com.example.demo.entity.User;
import com.example.demo.entity.dto.KelompokDTO;
import com.example.demo.entity.dto.VaksinDTO;
import com.example.demo.repository.KelompokRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VaksinRepository;


import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes=KelompokService.class)
public class KelompokServiceTest {
    
    private final EasyRandom EASY_RANDOM = new EasyRandom();
    private Long id;
    private List<Kelompok> kelompoks;
    private Kelompok kelompok;
  
    private KelompokDTO kelompokDTO;     
    @Autowired
    KelompokService kelompokService;
    @MockBean
    private UserService userService;
    @MockBean
    private KelompokRepository kelompokRepository;
    @MockBean
    private UserRepository userRepository;

    @MockBean
    private PasswordEncoder passwordEncoder;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        id = EASY_RANDOM.nextObject(Long.class);
        kelompoks = EASY_RANDOM.objects(Kelompok.class, 2)
                    .collect(Collectors.toList());
        kelompokDTO = EASY_RANDOM.nextObject(KelompokDTO.class);
        kelompok= EASY_RANDOM.nextObject(Kelompok.class);
        
    }

    @Test
    void testDeleteKelompok_Success() {
        when(kelompokRepository.findById(kelompok.getIdKelompok()))
        .thenReturn(Optional.of(kelompok));
    
       
        doNothing()
           .when(kelompokRepository).deleteById(kelompok.getIdKelompok());

            kelompokService.deleteKelompok(kelompok.getIdKelompok());

            verify(kelompokRepository).deleteById(kelompok.getIdKelompok());
    }
    @Test
    void deleteException_Test() {
        doThrow(RuntimeException.class)
            .when(kelompokRepository).deleteById(id);
      
        assertThrows(RuntimeException.class, () -> {
            kelompokService.deleteKelompok(id);;
        });
    }

    @Test
    void testFindById_Success() {
        when(kelompokRepository.findById(kelompok.getIdKelompok()))
            .thenReturn(Optional.of(kelompok));
        
        var result = kelompokService.findById(kelompok.getIdKelompok());

        assertEquals(kelompok, result);

    }
    @Test
    void getIdException_Test() {
        assertThrows(RuntimeException.class, () -> {
            kelompokService.findById(id);
        });
    }

    @Test
    void testGetByIdAndHubungan() {
        when(kelompokRepository.findByUser_IdUserAndHubungan(kelompok.getUser().getIdUser(), kelompok.getHubungan()))
        .thenReturn(kelompoks);
    
    var result = kelompokService.getByIdAndHubungan(kelompok.getUser().getIdUser(), kelompok.getHubungan());


    assertEquals(kelompoks, result);
}
    @Test
    void getByIdAndHubunganException_Test() {
        assertThrows(RuntimeException.class, () -> {
            kelompokService.getByIdAndHubungan(kelompok.getUser().getIdUser(), kelompok.getHubungan());
        });
    }

    @Test
    void testGetByUserId_Success() {
        when(kelompokRepository.findByUser_idUser(kelompok.getUser().getIdUser()))
            .thenReturn(kelompoks);
        
        var result = kelompokService.getByUserId(kelompok.getUser().getIdUser());


        assertEquals(kelompoks, result);
    }
    @Test
    void getByUserIdException_Test() {
        assertThrows(RuntimeException.class, () -> {
            kelompokService.getByUserId(kelompok.getUser().getIdUser());
        });
    }

    @Test
    void testGetKelompok() {
        when(kelompokRepository.findAll())
        .thenReturn(kelompoks);
    
        var result = kelompokService.getKelompok();

        verify(kelompokRepository, times(1)).findAll();

        assertEquals(kelompoks, result);
}

    @Test
    void getAllException_Test() {
        assertThrows(RuntimeException.class, () -> {
            kelompokService.getKelompok();
        });
    }
    @Test
    void testSave_Success() {
    
        // User user = new User();
        
        // when(userService.findById(kelompokDTO.getIdUser()))
        // .thenReturn(user.builder().idUser(kelompokDTO.getIdUser()).build());

        // kelompok.setUser(user.builder().idUser(kelompokDTO.getIdUser()).build());
        // kelompok.setNik(kelompokDTO.getNik()    );
        // kelompok.setHubungan(kelompokDTO.getHubungan());
        // kelompok.setNamaKelompok(kelompokDTO.getNamaKelompok());
        // kelompok.setTlp(kelompokDTO.getTlp());
        // kelompok.setTglLahir(kelompokDTO.getTglLahir());

        // when(kelompokRepository.save(kelompok))
        // .thenReturn(kelompok);
        // var result = kelompokService.save(kelompokDTO);

        // assertEquals(kelompok, result);

    }
    @Test
    void saveException_Test() {
        // KelompokDTO kelompokDTO =new KelompokDTO();
        // when(kelompokRepository.findById(kelompok.getIdKelompok()))
        //     .thenReturn(Optional.of(kelompok));
        // assertThrows(RuntimeException.class, () -> {
        //     kelompokService.save(kelompokDTO);
        // });
    }

    @Test
    void testUpdateKelompok() {
        KelompokDTO kelompokDTO = new KelompokDTO();
       
        kelompokDTO = new KelompokDTO();
        kelompokDTO.setNik("123456789");
        kelompokDTO.setHubungan("Kepala Kelompok");
        kelompokDTO.setNamaKelompok("polan");
        kelompokDTO.setTlp("081234567890");
        kelompokDTO.setTglLahir(new Date());
        kelompokDTO.setGender("male");
        kelompokDTO.setUpdatedAt(new Date());
        
        doReturn(Optional.of(kelompok))
        .when(kelompokRepository).findById(id);

        kelompok.setNik("123456789");
        kelompok.setHubungan("Kepala Kelompok");
        kelompok.setNamaKelompok("polan");
        kelompok.setTlp("081234567890");
        kelompok.setTglLahir(new Date());
        kelompok.setGender("male");
        kelompok.setUpdatedAt(new Date());

        when(kelompokRepository.save(kelompok)).thenReturn(kelompok);
        var result = kelompokService.updateKelompok(id,kelompokDTO);
        assertEquals(kelompok, result);

    }
    @Test
    void updateKelompokException_Test() {
        KelompokDTO kelompokDTO = EASY_RANDOM.nextObject(KelompokDTO.class);
        assertThrows(RuntimeException.class, () -> {
            kelompokService.updateKelompok(id,kelompokDTO);
        });
    }
}
