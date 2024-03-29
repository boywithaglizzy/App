package br.com.kirgh.app.repositories;

import br.com.kirgh.app.entities.UserRelation;
import br.com.kirgh.app.pks.UserRelationPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * This code is defining a Spring Data JPA repository interface for the {@code UserRelation} entity. The interface extends the
 * {@code JpaRepository} interface, which provides basic CRUD (Create, Read, Update, Delete) operations for the entity. The
 * {@code UserRelationPK} is the primary key class for the {@code UserRelation} entity, and it is used as the second generic type
 * parameter of the {@code JpaRepository} interface. This allows the repository to handle composite primary keys.
 */
@SuppressWarnings("SqlResolve")
public interface UserRelationRepository extends JpaRepository<UserRelation, UserRelationPK> {
    /**
     * The function deletes a parent-child relationship from the {@code user_relations} table based on the
     * child's ID.
     *
     * @param childId The {@code childId} parameter is a UUID (Universally Unique Identifier) that represents
     *                the ID of the child for which the parent relation needs to be deleted.
     */
    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = """
                        DELETE FROM
                            user_relations
                        WHERE
                            child_id = :childId
                    """
    )
    void deleteParentRelationByChildId(@Param("childId") UUID childId);

    /**
     * The function retrieves all user relations associated with a specific owner ID.
     *
     * @param ownerId The {@code ownerId} parameter is a UUID (Universally Unique Identifier) that represents
     *                the ID of the owner user.
     * @return The query is returning a list of {@code UserRelation} objects.
     */
    @Query(nativeQuery = true,
            value = """
                        SELECT
                            user_relations.child_id, user_relations.owner_id, user_relations.relation_type
                        FROM
                            user_relations
                        WHERE
                            owner_id = :ownerId
                    """
    )
    List<UserRelation> getAllUsersRelationBoundUser(@Param("ownerId") UUID ownerId);
}
