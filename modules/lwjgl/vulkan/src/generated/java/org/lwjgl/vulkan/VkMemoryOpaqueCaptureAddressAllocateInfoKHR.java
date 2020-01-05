/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Request a specific address for a memory allocation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code opaqueCaptureAddress} is zero, no specific address is requested.</p>
 * 
 * <p>If {@code opaqueCaptureAddress} is not zero, it <b>should</b> be an address retrieved from {@link KHRBufferDeviceAddress#vkGetDeviceMemoryOpaqueCaptureAddressKHR GetDeviceMemoryOpaqueCaptureAddressKHR} on an identically created memory allocation on the same implementation.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In most cases, it is expected that a non-zero {@code opaqueAddress} is an address retrieved from {@link KHRBufferDeviceAddress#vkGetDeviceMemoryOpaqueCaptureAddressKHR GetDeviceMemoryOpaqueCaptureAddressKHR} on an identically created memory allocation. If this is not the case, it likely that {@link KHRBufferDeviceAddress#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR} errors will occur.</p>
 * 
 * <p>This is, however, not a strict requirement because trace capture/replay tools may need to adjust memory allocation parameters for imported memory.</p>
 * </div>
 * 
 * <p>If this structure is not present, it is as if {@code opaqueCaptureAddress} is zero.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRBufferDeviceAddress#VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code opaqueCaptureAddress} &ndash; the opaque capture address requested for the memory allocation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryOpaqueCaptureAddressAllocateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t opaqueCaptureAddress;
 * }</code></pre>
 */
public class VkMemoryOpaqueCaptureAddressAllocateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPAQUECAPTUREADDRESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPAQUECAPTUREADDRESS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code opaqueCaptureAddress} field. */
    @NativeType("uint64_t")
    public long opaqueCaptureAddress() { return nopaqueCaptureAddress(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR opaqueCaptureAddress(@NativeType("uint64_t") long value) { nopaqueCaptureAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR set(
        int sType,
        long pNext,
        long opaqueCaptureAddress
    ) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureAddress(opaqueCaptureAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR set(VkMemoryOpaqueCaptureAddressAllocateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR malloc() {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR calloc() {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance for the specified memory address. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR create(long address) {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryOpaqueCaptureAddressAllocateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryOpaqueCaptureAddressAllocateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #opaqueCaptureAddress}. */
    public static long nopaqueCaptureAddress(long struct) { return UNSAFE.getLong(null, struct + VkMemoryOpaqueCaptureAddressAllocateInfoKHR.OPAQUECAPTUREADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryOpaqueCaptureAddressAllocateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryOpaqueCaptureAddressAllocateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #opaqueCaptureAddress(long) opaqueCaptureAddress}. */
    public static void nopaqueCaptureAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryOpaqueCaptureAddressAllocateInfoKHR.OPAQUECAPTUREADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryOpaqueCaptureAddressAllocateInfoKHR, Buffer> implements NativeResource {

        private static final VkMemoryOpaqueCaptureAddressAllocateInfoKHR ELEMENT_FACTORY = VkMemoryOpaqueCaptureAddressAllocateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkMemoryOpaqueCaptureAddressAllocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryOpaqueCaptureAddressAllocateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryOpaqueCaptureAddressAllocateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code opaqueCaptureAddress} field. */
        @NativeType("uint64_t")
        public long opaqueCaptureAddress() { return VkMemoryOpaqueCaptureAddressAllocateInfoKHR.nopaqueCaptureAddress(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryOpaqueCaptureAddressAllocateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryOpaqueCaptureAddressAllocateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) { VkMemoryOpaqueCaptureAddressAllocateInfoKHR.nopaqueCaptureAddress(address(), value); return this; }

    }

}