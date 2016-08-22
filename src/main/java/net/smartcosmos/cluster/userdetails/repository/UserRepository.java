package net.smartcosmos.cluster.userdetails.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import net.smartcosmos.cluster.userdetails.domain.UserEntity;

/**
 * Initially created by SMART COSMOS Team on June 30, 2016.
 */
public interface UserRepository extends JpaRepository<UserEntity, UUID>,
                                        PagingAndSortingRepository<UserEntity, UUID>,
                                        JpaSpecificationExecutor<UserEntity> {

    Optional<UserEntity> findByUsernameAndTenantId(String username, UUID tenantId);

    Optional<UserEntity> findByTenantIdAndId(UUID tenantId, UUID id);

    List<UserEntity> findByTenantId(UUID tenantId);

    Optional<UserEntity> findByUsernameIgnoreCase(String username);

}
