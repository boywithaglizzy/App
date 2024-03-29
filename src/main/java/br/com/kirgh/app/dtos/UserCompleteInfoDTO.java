package br.com.kirgh.app.dtos;

import br.com.kirgh.app.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * The {@code UserCompleteInfoDTO} class is a data transfer object that contains information about a user,
 * their relations, and their addresses.
 */
@Getter
@Setter
@NoArgsConstructor
public class UserCompleteInfoDTO {
    private User userData;
    private List<UserRelationInfoDTO> userRelation;
    private List<AddressCompleteInfoDTO> addresses;
}
