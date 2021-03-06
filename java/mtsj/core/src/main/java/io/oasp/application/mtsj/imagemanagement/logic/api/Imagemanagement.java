package io.oasp.application.mtsj.imagemanagement.logic.api;

import java.util.List;

import io.oasp.application.mtsj.imagemanagement.logic.api.to.ImageEto;
import io.oasp.application.mtsj.imagemanagement.logic.api.to.ImageSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Imagemanagement component.
 */
 //guide-logic-layer example1
public interface Imagemanagement {

  /**
   * Returns a Image by its id 'id'.
   *
   * @param id The id 'id' of the Image.
   * @return The {@link ImageEto} with id 'id'
   */
  ImageEto findImage(Long id);

  /**
   * Returns a paginated list of Images matching the search criteria.
   *
   * @param criteria the {@link ImageSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ImageEto}s.
   */
  PaginatedListTo<ImageEto> findImageEtos(ImageSearchCriteriaTo criteria);

  /**
   * Deletes a image from the database by its id 'imageId'.
   *
   * @param imageId Id of the image to delete
   * @return boolean <code>true</code> if the image can be deleted, <code>false</code> otherwise
   */
  boolean deleteImage(Long imageId);

  /**
   * Saves a image and store it in the database.
   *
   * @param image the {@link ImageEto} to create.
   * @return the new {@link ImageEto} that has been saved with ID and version.
   */
  ImageEto saveImage(ImageEto image);

}