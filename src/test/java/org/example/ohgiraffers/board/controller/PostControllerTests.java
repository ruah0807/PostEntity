package org.example.ohgiraffers.board.controller;

import org.example.ohgiraffers.board.service.PostService;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;


/** 통합테스트 & 단위테스트
 *
 *  통합테스트
 *      모듈을 통합하는 과정에서 모듈간의 호환성을 확인하기 위해 수행되는 테스트
 *      통합테스트는 API의 모든 과정이 올바르게 동작하는지 확인하는 것
 *
 *  단위(유닛)테스트
 *      하나의 모듈을 기준으로 독립적으로 진행되는 가장 작은 단위의 테스트 (작은 단위 = 함수, 메소드)
 *      단위테스트는 어플리케이션을 구성하는 하나의 기능이 올바르게 동작하는지 독립적으로 테스트하는 것.
 */
@WebMvcTest
public class PostControllerTests {
    //http 통신 메소드 : post, get, put, delete.... etc,.

    //MockMvc

    @MockBean
    PostService postService;
}
